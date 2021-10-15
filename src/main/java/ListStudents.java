import java.util.ArrayList;

public class ListStudents {
    private ArrayList<Student> listStudents = new ArrayList();

    public ArrayList<Student> addStudent(Student st){
        listStudents.add(st);
        return listStudents;
    }

    public ArrayList<Student> getListStudents() {
        return listStudents;
    }

    public void setListStudents(ArrayList<Student> listStudents) {
        this.listStudents = listStudents;
    }

    public ArrayList<Student> searchName(String name){
        ArrayList <Student> listSearch = new ArrayList<>();
        for(int i = 0; i < listStudents.size(); i++)
        {
            if(name.trim().equalsIgnoreCase(listStudents.get(i).getFirst_name()))
            {
                listSearch.add(listStudents.get(i));
            }
        }
        return listSearch;
    }

    public ArrayList<Student> searchGender(String gender)  {
        ArrayList <Student> listSearch = new ArrayList<>();
        for(int i = 0; i < listStudents.size(); i++)
        {
            if(gender.trim().equalsIgnoreCase(listStudents.get(i).getGender()))
            {
                listSearch.add(listStudents.get(i));
            }
        }
        return listSearch;
    }



}
