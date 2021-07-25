package com.windmill.test;

import java.util.List;

import com.windmill.mapping.Parser;
import com.windmill.metadata.Table;

public class Main {

	public static void main(String[] args) throws Exception {
		
		List<Table> tables = Parser.getParseTables();
		System.out.println(tables.toString());
		System.out.println("finished");
	}

}
