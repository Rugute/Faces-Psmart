package org.openmrs.module.facespsmart.metadata;

import org.openmrs.PatientIdentifierType;
import org.openmrs.module.metadatadeploy.bundle.AbstractMetadataBundle;
import org.springframework.stereotype.Component;

import static org.openmrs.module.metadatadeploy.bundle.CoreConstructors.patientIdentifierType;


/**
 * Created by rugute on 2/28/18.
 */
@Component
public class SmartCardMetadata extends AbstractMetadataBundle {

    public static final String MODULE_ID = "facespsmart";

    public static final class _PatientIdentifierType {
        public static final String SMART_CARD_SERIAL_NUMBER = "8f842498-1c5b-11e8-accf-0ed5f89f718b";
        public static final String HTS_NUMBER = "e6af3782-1cb3-11e8-accf-0ed5f89f718b";
        public static final String GODS_NUMBER = "9aedb9ae-1cbd-11e8-accf-0ed5f89f718b";
    }

    @Override
    public void install() throws Exception {
        install(patientIdentifierType("Smart Card Serial Number", "P-SMART Serial Number", null, null,
                null, PatientIdentifierType.LocationBehavior.NOT_USED, false, _PatientIdentifierType.SMART_CARD_SERIAL_NUMBER));

        install(patientIdentifierType("HTS Number", "Number assigned to clients when tested for HIV", null, null,
                null, PatientIdentifierType.LocationBehavior.NOT_USED, false, _PatientIdentifierType.HTS_NUMBER));

        install(patientIdentifierType("GODS Number", "Number assigned by MPI", null, null,
                null, PatientIdentifierType.LocationBehavior.NOT_USED, false, _PatientIdentifierType.GODS_NUMBER));


    }
}