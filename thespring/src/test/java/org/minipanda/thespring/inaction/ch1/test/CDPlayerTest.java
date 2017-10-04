package org.minipanda.thespring.inaction.ch1.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.minipanda.thespring.inaction.ch1.CompactDisc;
import org.minipanda.thespring.inaction.ch1.config.CDPlayerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {CDPlayerConfig.class})
public class CDPlayerTest {

	@Autowired
	@Qualifier("repeatedSgtPeppers")
	private CompactDisc cd;
	
	@Test
	public void cdShouldNotBeNull(){
		Assert.assertNotNull(cd);
		cd.play();
	}
	
}
