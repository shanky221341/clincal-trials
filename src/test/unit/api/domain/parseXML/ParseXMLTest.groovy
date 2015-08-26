package api.domain.parseXML

import org.junit.Ignore
import org.junit.Test

class ParseXMLTest {

	@Test
	void 'should parse XML from file'(){

		def schema =  Test.class.getResource( '/XML-Schema' ).text

		def response = new XmlSlurper().parseText(schema)

		response.children().each{ println it.attributes().text()}
	}
}
