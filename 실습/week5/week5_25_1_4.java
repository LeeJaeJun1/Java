package week5;

class Employee {
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name; this.salary = salary;
    }

    public String getName() { return name; }
    public int getSalary() { return salary; }
    public void setSalary(int salary) { this.salary = salary; }

    @Override
    public String toString() {
        return "이름: " + name + ", 월급 : " + salary;
    }
}

class Staff extends Employee {
    private String department;
    private int peerEvaluation;
    public Staff(String name) {
        super(name, 4500);
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void evaluatePeers(Staff[] peers) { // 11로 바꿈
        for(Staff peer : peers) {
            if(false == peer.equals(this)) {
                int evaluation = (int)(Math.random() * 11);
                peer.evaluate(evaluation);
            }
        }
    }

    public void evaluate(int value) {
        peerEvaluation += value;
    }
    public int getPeerEvaluation() { return peerEvaluation; }
    @Override
    public String toString() {
        return super.toString() + ", 부서: " + department + ", 동료 평가점수: " + peerEvaluation;
    }
}

class Manager extends Employee {
    private String department;
    Staff[] staffList;
    private final int BOUNS = 50;
    private final int BASE_UP = 500;

    public Manager(String name, int salary, String department, Staff[] staffList) {
        super(name,salary);
        this.department = department;
        this.staffList = staffList;

        for(Staff staff : staffList) {
            staff.setDepartment(department);
        }
    }

    public void evaluatePerformance() {
        for(Staff staff : staffList) {
            staff.evaluatePeers(this.staffList);
        }
        for(Staff staff : this.staffList) {
            int performanceRating = staff.getPeerEvaluation();
            int bonus = performanceRating * BOUNS;
            int newSalary = staff.getSalary() + BASE_UP + bonus;
            staff.setSalary(newSalary);
        }
    }

    public Staff[] getStaffList() {
        return staffList;
    }

    @Override
    public String toString() {
        return super.toString() + ", 부서: " + department;
    }
}

public class week5_25_1_4 {
    public static void main(String[] args) {
        Staff[] staffList = new Staff[3];
        staffList[0] = new Staff("김인하");
        staffList[1] = new Staff("이인하");
        staffList[2] = new Staff("강인하");
        Manager manager = new Manager("최인하", 50000, "SW개발팀", staffList);
        // Manager 생성자 4개

        // 직원 정보 출력
        System.out.println("Staff Information:");
        for(Staff staff : manager.getStaffList()) {
            System.out.println(staff); //
        }
        System.out.println();

        // 매니저가 직원들의 성과를 평가하고 셀러리를 조정
        manager.evaluatePerformance();

        // 셀러리 조정 후 결과 출력
        System.out.println("After Performance Evaluation:");
        for(Staff staff : manager.getStaffList()) {
            System.out.println(staff);
        }
    }
}
