class Employee(Emp_name: String, Emp_id: Int, Address: String, Mail_id: String, Mobile_no: String) {
    def this(Emp_name: String, Emp_id: Int) = {
      this(Emp_name, Emp_id, "", "", "")
    }
  }
  
  class Programmer(Emp_name: String, Emp_id: Int, BasicPay: Double) extends Employee(Emp_name, Emp_id) {
    val DA: Double = 0.97 * BasicPay
    val HRA: Double = 0.10 * BasicPay
    val PF: Double = 0.12 * BasicPay
    val StaffClubFund: Double = 0.001 * BasicPay
  
    def grossSalary: Double = BasicPay + DA + HRA
    def netSalary: Double = grossSalary - PF - StaffClubFund
  }
  
  class AssistantProfessor(Emp_name: String, Emp_id: Int, BasicPay: Double) extends Employee(Emp_name, Emp_id) {
    val DA: Double = 0.97 * BasicPay
    val HRA: Double = 0.10 * BasicPay
    val PF: Double = 0.12 * BasicPay
    val StaffClubFund: Double = 0.001 * BasicPay
  
    def grossSalary: Double = BasicPay + DA + HRA
    def netSalary: Double = grossSalary - PF - StaffClubFund
  }
  
  class AssociateProfessor(Emp_name: String, Emp_id: Int, BasicPay: Double) extends Employee(Emp_name, Emp_id) {
    val DA: Double = 0.97 * BasicPay
    val HRA: Double = 0.10 * BasicPay
    val PF: Double = 0.12 * BasicPay
    val StaffClubFund: Double = 0.001 * BasicPay
  
    def grossSalary: Double = BasicPay + DA + HRA
    def netSalary: Double = grossSalary - PF - StaffClubFund
  }
  
  class Professor(Emp_name: String, Emp_id: Int, BasicPay: Double) extends Employee(Emp_name, Emp_id) {
    val DA: Double = 0.97 * BasicPay
    val HRA: Double = 0.10 * BasicPay
    val PF: Double = 0.12 * BasicPay
    val StaffClubFund: Double = 0.001 * BasicPay
  
    def grossSalary: Double = BasicPay + DA + HRA
    def netSalary: Double = grossSalary - PF - StaffClubFund
  }
  
  object PaySlipGenerator {
    def generatePaySlip(employee: Employee): Unit = {
      println(s"Employee Name: ${employee.Emp_name}")
      println(s"Employee ID: ${employee.Emp_id}")
      println(s"Basic Pay: ${employee.BasicPay}")
      println(s"DA: ${employee.DA}")
      println(s"HRA: ${employee.HRA}")
      println(s"PF: ${employee.PF}")
      println(s"Staff Club Fund: ${employee.StaffClubFund}")
      println(s"Gross Salary: ${employee.grossSalary}")
      println(s"Net Salary: ${employee.netSalary}")
    }
  
    def main(args: Array[String]): Unit = {
      val programmer = new Programmer("John Doe", 101, 50000)
      val assistantProfessor = new AssistantProfessor("Jane Smith", 201, 60000)
      val associateProfessor = new AssociateProfessor("Bob Johnson", 301, 70000)
      val professor = new Professor("Alice Brown", 401, 80000)
  
      generatePaySlip(programmer)
      generatePaySlip(assistantProfessor)
      generatePaySlip(associateProfessor)
      generatePaySlip(professor)
    }
  }
  