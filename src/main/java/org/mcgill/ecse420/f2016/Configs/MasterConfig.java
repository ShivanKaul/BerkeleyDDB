package org.mcgill.ecse420.f2016.Configs;

import com.sleepycat.je.DatabaseConfig;
import com.sleepycat.je.DatabaseException;
import com.sleepycat.je.EnvironmentConfig;

import java.io.File;

public class MasterConfig extends Config {

    public MasterConfig(EnvironmentConfig envConfig,
                        DatabaseConfig dbConfig) throws DatabaseException {
        super("/tmp/master", envConfig, dbConfig);
    }
}
