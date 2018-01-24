package com.apache.cxf.pathparam.test;

import org.junit.Assert;
import org.junit.Test;

import fr.men.test.Agent;
import fr.men.test.AgentUtil;

public class TestSerialisation {
	
	@Test 
	public void testBasicDeserialisation() {
		String json = "{\"nom\":\"john\",\"prenom\":\"lennon\"}";
		Agent fromJson = AgentUtil.fromJson(json);
		Assert.assertEquals("", "john", fromJson.getNom());
	}

}
