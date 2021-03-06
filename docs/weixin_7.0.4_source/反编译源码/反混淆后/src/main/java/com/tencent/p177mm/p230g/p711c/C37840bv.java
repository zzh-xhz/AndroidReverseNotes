package com.tencent.p177mm.p230g.p711c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.p177mm.sdk.p603e.C4925c;

/* renamed from: com.tencent.mm.g.c.bv */
public abstract class C37840bv extends C4925c {
    private static final int dCr = "protocolNumber".hashCode();
    private static final int dCs = "logContent".hashCode();
    public static final String[] diI = new String[0];
    private static final int diR = "rowid".hashCode();
    private static final int dkf = "createTime".hashCode();
    private static final int dvy = "id".hashCode();
    private boolean dCp = true;
    private boolean dCq = true;
    private boolean djH = true;
    private boolean dvv = true;
    public long field_createTime;
    public String field_id;
    public String field_logContent;
    public int field_protocolNumber;

    /* renamed from: d */
    public final void mo8995d(Cursor cursor) {
        String[] columnNames = cursor.getColumnNames();
        if (columnNames != null) {
            int length = columnNames.length;
            for (int i = 0; i < length; i++) {
                int hashCode = columnNames[i].hashCode();
                if (dvy == hashCode) {
                    this.field_id = cursor.getString(i);
                    this.dvv = true;
                } else if (dCr == hashCode) {
                    this.field_protocolNumber = cursor.getInt(i);
                } else if (dCs == hashCode) {
                    this.field_logContent = cursor.getString(i);
                } else if (dkf == hashCode) {
                    this.field_createTime = cursor.getLong(i);
                } else if (diR == hashCode) {
                    this.xDa = cursor.getLong(i);
                }
            }
        }
    }

    /* renamed from: Hl */
    public final ContentValues mo10098Hl() {
        ContentValues contentValues = new ContentValues();
        if (this.dvv) {
            contentValues.put("id", this.field_id);
        }
        if (this.dCp) {
            contentValues.put("protocolNumber", Integer.valueOf(this.field_protocolNumber));
        }
        if (this.dCq) {
            contentValues.put("logContent", this.field_logContent);
        }
        if (this.djH) {
            contentValues.put("createTime", Long.valueOf(this.field_createTime));
        }
        if (this.xDa > 0) {
            contentValues.put("rowid", Long.valueOf(this.xDa));
        }
        return contentValues;
    }
}
