package f0;

import android.content.Context;
import java.io.File;
import q6.i;

/* compiled from: MyApplication */
public abstract class a {
    public static final File a(Context context, String str) {
        i.e(context, "<this>");
        i.e(str, "fileName");
        return new File(context.getApplicationContext().getFilesDir(), i.j("datastore/", str));
    }
}
