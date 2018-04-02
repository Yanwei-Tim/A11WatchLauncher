package fise.feng.com.beautifulwatchlauncher.dao;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import fise.feng.com.beautifulwatchlauncher.entity.BTBondEntity;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "BTBOND_ENTITY".
*/
public class BTBondEntityDao extends AbstractDao<BTBondEntity, Long> {

    public static final String TABLENAME = "BTBOND_ENTITY";

    /**
     * Properties of entity BTBondEntity.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property BtAdress = new Property(1, String.class, "btAdress", false, "BT_ADRESS");
        public final static Property Imei = new Property(2, String.class, "imei", false, "IMEI");
    }


    public BTBondEntityDao(DaoConfig config) {
        super(config);
    }
    
    public BTBondEntityDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"BTBOND_ENTITY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY AUTOINCREMENT ," + // 0: id
                "\"BT_ADRESS\" TEXT," + // 1: btAdress
                "\"IMEI\" TEXT);"); // 2: imei
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"BTBOND_ENTITY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, BTBondEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String btAdress = entity.getBtAdress();
        if (btAdress != null) {
            stmt.bindString(2, btAdress);
        }
 
        String imei = entity.getImei();
        if (imei != null) {
            stmt.bindString(3, imei);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, BTBondEntity entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String btAdress = entity.getBtAdress();
        if (btAdress != null) {
            stmt.bindString(2, btAdress);
        }
 
        String imei = entity.getImei();
        if (imei != null) {
            stmt.bindString(3, imei);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public BTBondEntity readEntity(Cursor cursor, int offset) {
        BTBondEntity entity = new BTBondEntity( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // btAdress
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2) // imei
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, BTBondEntity entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setBtAdress(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setImei(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(BTBondEntity entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(BTBondEntity entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(BTBondEntity entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}