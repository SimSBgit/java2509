package ch12.sec03.exam05;

import lombok.Data;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
//@AllArgsConstructor
//@NoArgsConstructor
@NonNull

public class Member {
	
	private String id;
	@NonNull private String name;
	private int age;
}
