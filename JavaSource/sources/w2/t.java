package w2;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: MyApplication */
public abstract class t {
    public static Object a(Context context, String str, r rVar) {
        try {
            return rVar.d(c(context).d(str));
        } catch (Exception e8) {
            throw new s(e8);
        }
    }

    public static Context b(Context context) {
        return c(context).b();
    }

    private static DynamiteModule c(Context context) {
        try {
            return DynamiteModule.e(context, DynamiteModule.f4575b, ModuleDescriptor.MODULE_ID);
        } catch (Exception e8) {
            throw new s(e8);
        }
    }
}
