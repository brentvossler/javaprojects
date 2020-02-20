package urs.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ IDGeneratorTest.class, ValidationServiceTest.class, RegistrationControllerTest.class,
		UserFactoryTest.class })
public class AllTests {

}
