package com.qa.BlackjackExample;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ BlackjackTestNormal.class, BlackjackTestBust.class })

public class ValidEntriesSuite {

}
