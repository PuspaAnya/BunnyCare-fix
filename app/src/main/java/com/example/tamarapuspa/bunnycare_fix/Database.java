package com.example.tamarapuspa.bunnycare_fix;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "sistempakar";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, 5);
    }



    public void createTable(SQLiteDatabase db) {
        db.execSQL("DROP TABLE IF EXISTS gejala");
        db.execSQL("CREATE TABLE if not exists gejala (id TEXT PRIMARY KEY, nama TEXT, " +
                "ya VARCHAR(5), tidak VARCHAR(5), mulai VARCHAR(5), selesai VARCHAR(5));");
    }

    public void createTable2(SQLiteDatabase db2) {
        db2.execSQL("DROP TABLE IF EXISTS penyakit");
        db2.execSQL("CREATE TABLE if not exists penyakit (kode_penyakit TEXT PRIMARY KEY , " +
                "nama_penyakit TEXT);");
    }

    public void generateData(SQLiteDatabase db) {
    ContentValues cv = new ContentValues();
        db.execSQL("INSERT INTO gejala VALUES ('G001','terlihat lemas dan malas', 'G003', 'B', 'Y', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G002','mata sayu', 'P001', 'P001', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G003','gigi bergemeletuk', 'G004', 'G006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G004','sering minum karna merasa haus terus menerus', 'G005', 'G005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G005','kotoran lembek dan cair', 'G002', 'G010', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G006','kotoran keras', 'G007', 'G012', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G007','jumlah kotoran sedikit', 'G008', 'G008', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G008','jumlah air kencing sedikit', 'G009', 'G009', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G009','air kencing berwarna gelap', 'P002', 'P002', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G010','daun telinga turun, mata memicing', 'G011', 'G011', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G011','kotoran berwarna hijau gelap', 'P003', 'P003', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G012','nafsu makan menurun, sehingga badan kelinci menjadi kurus', 'G013', 'G014', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G013','kotoran cair dan bercampur darah/lendir putih', 'P004', 'P004', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G014','hidung mengeluarkan lendir', 'G015', 'G015', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G015','kaki depan selalu berusaha menggaruk hidung', 'G016', 'G018', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G016','kaki dan bulu badan basah dengan lendir', 'G017', 'G017', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G017','mata sembab, basah dan berair', 'P005', 'P005', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G018','kepala sering diangkat tinggi', 'G019', 'G021', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G019','mata dan telinganya berwarna kebiruan', 'P006', 'P006', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G020','sering menggaruk telinga sehingga menjadi kemerahan', 'G022', 'G022', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G021','kepala sering digoyangkan', 'G020', 'G023', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G022','keluar cairan dari jaringan yang rusak', 'P007', 'P007', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G023','sering menggaruk bagian badan yang gatal', 'G024', 'G026', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G024','kulit di sekeliling yang gatal menjadi berubah/berkerak', 'G025', 'G025', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G025','bulu di area iritasi menjadi rontok', 'P008', 'P008', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G026','serangan pada kulit kepala menimbulkan sisik', 'G027', 'G027', 'T', 'T');");
        db.execSQL("INSERT INTO gejala VALUES ('G027','kulit kepala nampak pecah-pecah', 'P009', 'P001', 'T', 'T');");

        db.execSQL("INSERT INTO gejala VALUES ('P001','Mencret', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P002','Sembelit', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P003','Enteritis', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P004','Koksidiosis', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P005','Influenza', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P006','Pneumonia', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P007','Kanker Telinga', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P008','Scabies', '0', '0', 'T', 'Y');");
        db.execSQL("INSERT INTO gejala VALUES ('P009','Favus', '0', '0', 'T', 'Y');");

    }

    public void generateData2(SQLiteDatabase db2) {
        db2.execSQL("INSERT INTO penyakit VALUES ('P001', 'Mencret');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P002', 'Sembelit');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P003', 'Enteritis');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P004', 'Koksidiosis');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P005', 'Influenza');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P006', 'Pneumonia');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P007', 'Kanker Telinga');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P008', 'Scabies');");
        db2.execSQL("INSERT INTO penyakit VALUES ('P009', 'Favus');");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public void onCreate(SQLiteDatabase db) {

    }
}
