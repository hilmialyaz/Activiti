package org.milleni.dunning.datamodel.util;

import java.sql.Types;

public class SQLServerDialect extends org.hibernate.dialect.SQLServer2008Dialect {

	public SQLServerDialect() {
		super();
		registerColumnType(Types.CHAR, "nchar(1)");
		registerColumnType(Types.VARCHAR, "nvarchar($l)");
	}

}