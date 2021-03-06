package br.com.sec4you.bingo.dt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EnvVariables {
	protected static Logger LOG = Logger.getLogger(EnvVariables.class.getName());
	
	public static String envVariables(String variablesName) throws IOException {
        FileInputStream in = new FileInputStream("properties/data.properties");
        Properties propriedades = new Properties();
        propriedades.load(in);
        in.close();
        
        String valor = propriedades.getProperty(variablesName);
        if (valor != null)
        	LOG.info("Variável " + variablesName + " encontrada");
		return valor;
    }
	public static String getEnvVariable(String variablesName) {
		String env = null;
		try {
			env = envVariables(variablesName);
		} catch (IOException e) {
			LOG.log(Level.SEVERE, "Variável não encontrada: " + e.getMessage(), e);
		}
		return env;
	}
}