
public class Employee 
{
	
	private String firstName;
	private String lastName;
	private double monthlySalary;
	
	public Employee()
	{ 
		System.out.println("\nConstructor called");
	firstName=null;
	lastName=null;
	monthlySalary=0.0;
	}
	
	public void setFirstName(String fName)
	{
		this.firstName=fName;
	}
	public void setLastName(String lName)
	{
		this.lastName=lName;
	}
	public void setMonthlySalary(double mSalary)
	{
		if(mSalary>0)
			this.monthlySalary=mSalary;
		else
			System.out.println("\nMonthly Salary is negative so cannot set value");
		
	}
    public String getFirstName()
    {
    	return firstName;
    }
    public String getLastName()
    {
    	return lastName;
    }
    public double getMonthlySalary()
    {
    	return monthlySalary;
    }
    public double yearlySalary()
    {    double yearSalary;
         yearSalary=12*getMonthlySalary();
    	return yearSalary;
    }
    public double raiseSalary()
    {
    	double raisSalary;
    	double raiSalary;
    	raiSalary=0.1*yearlySalary();
    	raisSalary=raiSalary+yearlySalary();
    	return raisSalary;
    }
    
}
