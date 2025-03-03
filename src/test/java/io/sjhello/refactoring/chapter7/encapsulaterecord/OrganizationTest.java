package io.sjhello.refactoring.chapter7.encapsulaterecord;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

class OrganizationTest {

	@Test
	void organizationName() {
		Organization organization = EncapsulatedRecord.getOrganization();

		assertThat(organization.getName()).isEqualTo("Acme Gooseberries");
	}
}
