package util;

import java.math.BigDecimal;

public class PerformanceAvaliation {

	public BigDecimal throughput(float numberEvents, float time){						
		return new BigDecimal(numberEvents / time);
	}
	
	public BigDecimal mips(float numberEvents, float time){
		BigDecimal result = new BigDecimal(numberEvents / time);
		return result.divide(BigDecimal.valueOf(1000000));
	}
}
