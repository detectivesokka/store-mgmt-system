package model.db;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;
import model.StoreMgmtSystem;

/**
 *
 * @author Sai Dutt
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Database.db4o").toAbsolutePath().toString();// Path to the data store
    private static DB4OUtil dB4OUtil;

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {

            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            //Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            //Controls the depth/level of updation of Object
            config.common().updateDepth(Integer.MAX_VALUE);

            //Register your top most Class here
            config.common().objectClass(StoreMgmtSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
            return db;
            
        } catch (Exception ex) {
            
            System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(StoreMgmtSystem pSystem) {
        ObjectContainer conn = createConnection();
        conn.store(pSystem);
        conn.commit();
        conn.close();
    }

    public StoreMgmtSystem retrieveSystem() {
        ObjectContainer conn = createConnection();
        ObjectSet<StoreMgmtSystem> allSystems = conn.query(StoreMgmtSystem.class); // Change to the object you want to save
        StoreMgmtSystem system;
        
        if (allSystems.isEmpty()) {
            
            return new StoreMgmtSystem();
            
        } else {
            
            system = allSystems.get(allSystems.size() - 1);
        }
        
        conn.close();
        return system;
    }
}
