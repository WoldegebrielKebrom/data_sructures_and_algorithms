package DSProject;

public class main {
    public static void main(String[] args) {
        HashTable hashTable = new HashTable();

        Student std1 = new Student("umair", "15-123", 3.4);
        Student std2 = new Student("ali", "15-453", 3.1);
        Student std3 = new Student("ali", "15-233", 3.2);
        Student std4 = new Student("awais", "15-321", 3.9);


        int std1key = hashTable.toHashCode(std1.getRoll_no());
        int std2key = hashTable.toHashCode(std2.getRoll_no());
        int std3key = hashTable.toHashCode(std3.getRoll_no());
        int std4key = hashTable.toHashCode(std4.getRoll_no());


        hashTable.insert(std1key,std1);
        hashTable.insert(std2key,std2);
        hashTable.insert(std3key,std3);
        hashTable.insert(std4key,std4);

        hashTable.deleteStd(std3.getRoll_no());
        hashTable.showData();

        Student new_Std2 = hashTable.fetchStdinfo(std2.getRoll_no());
        if(new_Std2.getName().equals(std2.getName())){
            System.out.println("equal");
        }





    }
}
