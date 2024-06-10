package com.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.connections.DBconnection;
import com.model.Article;
import com.opensymphony.xwork2.ActionContext;

public class ArticleDAO {
	Connection connection = DBconnection.getInstance().getConnection();
	
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean insertArticleInDB(String title,String image_path,String content) {
		String sql="insert into Article(userId,title,image_path,content) values(?,?,?,?)";
			try {
			PreparedStatement pst=connection.prepareStatement(sql);
			pst.setInt(1,(int)ActionContext.getContext().getSession().get("id"));
			pst.setString(2,title);
			pst.setString(3,image_path);
			pst.setString(4,content);	
			int stTIS=pst.executeUpdate();
			return stTIS>0;
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return false;
		
		
	}
	public List<Article> fetchArticlesFromDB() throws IOException{
		System.out.println("fetching article");
	    List<Article> articlesList=new ArrayList<>();
		String sql="select user_data.Name , article.userId,article.title,article.image_Path,article.content,article.date from article inner join user_data on article.userId=user_data.Id;";
		try {
			PreparedStatement pst=connection.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				String readContent=getContentFromFile(rs.getString ("content"));
				Article article=new Article(rs.getString("Name"),rs.getString("title"),rs.getString("image_Path"),readContent,rs.getDate("date"),rs.getInt("userId"));			
				articlesList.add(article);
			}
	
		}catch (SQLException e) {
			System.out.println(e);
		}
		return articlesList;
		
	}
	
		public String getContentFromFile(String contentpath) throws IOException {
			System.out.println("reader");
			FileReader fileReader=new FileReader(contentpath);
			StringBuilder content=new StringBuilder();
			int word;
			while ((word=fileReader.read())!=-1) {
				content.append((char)word);
			}
			fileReader.close();
			return content.toString();
		}
}
