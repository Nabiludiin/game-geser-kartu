package w0;

import android.database.Cursor;
import android.database.MatrixCursor;

/* compiled from: MyApplication */
public abstract class b {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i7 = 0; i7 < cursor.getColumnCount(); i7++) {
                    int type = cursor.getType(i7);
                    if (type == 0) {
                        objArr[i7] = null;
                    } else if (type == 1) {
                        objArr[i7] = Long.valueOf(cursor.getLong(i7));
                    } else if (type == 2) {
                        objArr[i7] = Double.valueOf(cursor.getDouble(i7));
                    } else if (type == 3) {
                        objArr[i7] = cursor.getString(i7);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i7] = cursor.getBlob(i7);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            cursor.close();
            return matrixCursor;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static int b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
