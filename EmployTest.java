public class EmployTest {
    public static void main(String[] args) {
        Employee[] staff = new Employee[3];
        staff[0]=new Employee("Fengyong",20000,2022,1,17);
        staff[1]=new Employee("ZhouJianPeng",20000,2022,2,18);
        staff[2]=new Employee("Anonymous",60000,2022,3,19);

        for (Employee e :
                staff) {
            System.out.println("name= "+e.getName()+" ,salary= "+e.getSalary()+" ,horeDay= "+e.getHireDay());
        }
    }

}
