/**
 * Copyright (c) 2016 LARUS Business Automation [http://www.larus-ba.it]
 * <p>
 * This file is part of the "LARUS Integration Framework for Neo4j".
 * <p>
 * The "LARUS Integration Framework for Neo4j" is licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * <p>
 * Created on 03/02/16
 */
package it.neo4j.jdbc;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLFeatureNotSupportedException;
import java.sql.SQLTimeoutException;
import java.util.logging.Logger;

/**
 * @author AgileLARUS
 * @since 3.0.0
 */
public abstract class DataSource implements javax.sql.DataSource {

	@Override public Connection getConnection() throws SQLException {
		return null;
	}


	@Override public Connection getConnection(String username, String password) throws SQLException {
		return null;
	}


	@Override public PrintWriter getLogWriter() throws SQLException {
		return null;
	}


	@Override public void setLogWriter(PrintWriter out) throws SQLException {

	}


	@Override public void setLoginTimeout(int seconds) throws SQLException {

	}


	@Override public int getLoginTimeout() throws SQLException {
		return 0;
	}


	@Override public Logger getParentLogger() throws SQLFeatureNotSupportedException {
		return null;
	}


	@Override public <T> T unwrap(Class<T> iface) throws SQLException {
		return null;
	}


	@Override public boolean isWrapperFor(Class<?> iface) throws SQLException {
		return false;
	}
}
