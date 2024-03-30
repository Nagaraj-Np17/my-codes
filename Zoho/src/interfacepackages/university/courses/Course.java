package interfacepackages.university.courses;

import java.util.ArrayList;

public class Course {
	
private String courseName;
	private int courseDuratoin;
    private int courseFees;
    private ArrayList<String>courseSyllabus;
    private String handlingFaculty;

    public String getCourseName() {
        return courseName;
    }

    public int getCourseDuratoin() {
        return courseDuratoin;
    }

    public int getCourseFees() {
        return courseFees;
    }

   
    public ArrayList<String> getCourseSyllabus() {
        return courseSyllabus;
    }

    public String getHandlingFaculty() {
        return handlingFaculty;
    }

    public Course(String courseName, int courseDuratoin, int courseFees, ArrayList<String> courseSyllabus, String handlingFaculty) {
        this.courseName = courseName;
        this.courseDuratoin = courseDuratoin;
        this.courseFees = courseFees;
        
        this.courseSyllabus = courseSyllabus;
        this.handlingFaculty = handlingFaculty;
}}
