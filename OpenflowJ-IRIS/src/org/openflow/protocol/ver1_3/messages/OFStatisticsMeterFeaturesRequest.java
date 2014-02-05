package org.openflow.protocol.ver1_3.messages;

import java.nio.ByteBuffer;
import org.openflow.util.*;

import org.openflow.protocol.ver1_3.types.*;

public class OFStatisticsMeterFeaturesRequest extends OFStatisticsRequest implements org.openflow.protocol.interfaces.OFStatisticsMeterFeaturesRequest {
    public static int MINIMUM_LENGTH = 16;
    public static int CORE_LENGTH = 0;

    

    public OFStatisticsMeterFeaturesRequest() {
        super();
		setLength(U16.t(MINIMUM_LENGTH));
		setType(OFMessageType.valueOf((byte)18));
		setStatisticsType(OFStatisticsType.valueOf((short)11, this.type));
    }
    
    public OFStatisticsMeterFeaturesRequest(OFStatisticsMeterFeaturesRequest other) {
    	super(other);
    }

	
	
	
	
	public OFStatisticsMeterFeaturesRequest dup() {
		return new OFStatisticsMeterFeaturesRequest(this);
	}
	
    public void readFrom(ByteBuffer data) {
        super.readFrom(data);
    }

    public void writeTo(ByteBuffer data) {
    	super.writeTo(data);
        
    }

    public String toString() {
        return super.toString() +  ":OFStatisticsMeterFeaturesRequest";
    }

	// compute length (without final alignment)    
    public short computeLength() {
    	short len = (short)(CORE_LENGTH + super.computeLength());
    	return len;
    }
    
    // calculate the amount that will be increased by the alignment requirement.
    public short alignment(int total, int req) {
    	return (short)((total + (req-1))/req*req - total);
    }
    
    // compute the difference with MINIMUM_LENGTH (with alignment)
    public short lengthDiff() {
    	short total = computeLength();
    	return (short)(total - (short)MINIMUM_LENGTH + alignment(total, 0));
    }

    @Override
    public int hashCode() {
        		
		final int prime = 1549;
		int result = super.hashCode() * prime;
		
		return result;
    }

    @Override
    public boolean equals(Object obj) {
        
		if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof OFStatisticsMeterFeaturesRequest)) {
            return false;
        }
        
        return true;
    }
}
