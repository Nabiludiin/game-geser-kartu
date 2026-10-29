package p3;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;

/* compiled from: MyApplication */
public abstract class c0 implements DialogInterface.OnClickListener {
    public static c0 b(Activity activity, Intent intent, int i7) {
        return new a0(intent, activity, i7);
    }

    public static c0 c(m3.j jVar, Intent intent, int i7) {
        return new b0(intent, jVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i7) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e8) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e8);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
