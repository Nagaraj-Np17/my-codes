package com.actions;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.connections.Constants;
import com.dao.ArticleDAO;
import com.model.Article;
import com.opensymphony.xwork2.ActionContext;

public class ArticleAction {
	ArticleDAO articleModel;
	private String title;
	private String image_path;
	private File image;
	private String imageFileName;
	private String content;
	private List<Article> articles;
	private String errorMessage;

	public File getImage() {
		return image;
	}

	public void setImage(File image) {
		this.image = image;
	}

	public String getImageFileName() {
		return imageFileName;
	}

	public void setImageFileName(String imageFileName) {
		this.imageFileName = imageFileName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImage_path() {
		return image_path;
	}

	public void setImage_path(String image_path) {
		this.image_path = image_path;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String execute() {

		return insertArticle();

	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String setErrorMessage) {
		this.errorMessage = setErrorMessage;
	}

	public String insertArticle() {

		String userDirectoryName = (String) ActionContext.getContext().getSession().get("username");
		System.out.println(image);
		String projectDir = "D:\\Java\\WebApp\\Struts\\src\\main\\webapp";
		File imagesFolder = new File(projectDir + "/images/" + userDirectoryName);
		if (!imagesFolder.exists() && !imagesFolder.mkdirs()) {
			System.out.println("Failed to create image directory.");
		}
		File contentFolder = new File(projectDir + "/contents/" + userDirectoryName);
		if (!contentFolder.exists() && !contentFolder.mkdirs()) {
			System.out.println("Failed to create content directory.");
		}
		try {
			File imageFile = new File(imagesFolder, imageFileName);
			FileUtils.copyFile(image, imageFile);
			String contentFilePath = projectDir + "/contents/" + userDirectoryName + "/" + title + ".txt";
			FileUtils.writeStringToFile(new File(contentFilePath), content, "UTF-8");
			articleModel = new ArticleDAO();

			if (articleModel.insertArticleInDB(title, "images/" + userDirectoryName + "/" + imageFileName,
					contentFilePath)) {
				return "success";
			} else {
				return "error";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "error";

	}

	public String fetchArticles() throws IOException {
		if (!Constants.loginOrNot()) {
			System.out.println("FetchArticle");
			setErrorMessage("Access Denied Do Login First");
			return "dologin";
		}
		ArticleDAO articleDAO = new ArticleDAO();
		List<Article> listOfArticles = articleDAO.fetchArticlesFromDB();
		setArticles(listOfArticles);
		ServletActionContext.getRequest().setAttribute("articles", articles);
		return "success";

	}

}
