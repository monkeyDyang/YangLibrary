package yy;

public class CompositePatternDemo {
    public static void main(String[] args) {
        //CEO
        Employee CEO = new Employee("John","CEO", 30000);
        //首席销售
        Employee headSales = new Employee("Robert","Head Sales", 20000);
        //首席营销
        Employee headMarketing = new Employee("Michel","Head Marketing", 20000);
        //店员1、店员2
        Employee clerk1 = new Employee("Laura","Marketing", 10000);
        Employee clerk2 = new Employee("Bob","Marketing", 10000);
        //销售主管1、销售主管2
        Employee salesExecutive1 = new Employee("Richard","Sales", 10000);
        Employee salesExecutive2 = new Employee("Rob","Sales", 10000);

        CEO.add(headSales);
        CEO.add(headMarketing);

        headSales.add(salesExecutive1);
        headSales.add(salesExecutive2);

        headMarketing.add(clerk1);
        headMarketing.add(clerk2);

        //打印该组织的所有员工
        System.out.println(CEO);
        for (Employee headEmployee : CEO.getSubordinates()) {
            System.out.println(headEmployee);
            for (Employee employee : headEmployee.getSubordinates()) {
                System.out.println(employee);
            }
        }
    }
}
