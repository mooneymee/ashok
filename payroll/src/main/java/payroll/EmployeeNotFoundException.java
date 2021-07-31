package payroll;

class EmployeeNotFoundException extends RuntimeException{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmployeeNotFoundException(Long id) {
		// TODO Auto-generated constructor stub
		
		super("Could not find the employee "+ id);
	}

}
