package Scripts;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import Generic_Library.Basefunctions;
import Page_Factory.pf_CaadminsetupPage;

public class CaAdminSetup_Script extends Basefunctions{
	final static Logger log = Logger.getLogger(CaAdministratorProfile_Script.class);
	
	@Test(enabled=true,priority=2,groups={"SMK","REG"})
	public void casetup() {
		log.info("this is pre-login information");
		pf_CaadminsetupPage p=new pf_CaadminsetupPage(w);
		et =  es.startTest("Prelogin setup Details");
		//p.newLicense();
		p.existingLicense();

	}

}
