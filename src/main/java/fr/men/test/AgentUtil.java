package fr.men.test;

import org.apache.commons.lang3.StringUtils;
import org.codehaus.jackson.JsonParser.Feature;
import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

public class AgentUtil {
	
	public static Agent fromJson(String json) {
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(Feature.AUTO_CLOSE_SOURCE, true);
		try {
			return objectMapper.readValue(StringUtils.trimToEmpty(json), Agent.class);
		} catch (Exception e) {
			return null;
		}
	}

}
