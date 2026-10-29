package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;

/* compiled from: MyApplication */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(androidx.versionedparcelable.a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1546a = (IconCompat) aVar.v(remoteActionCompat.f1546a, 1);
        remoteActionCompat.f1547b = aVar.l(remoteActionCompat.f1547b, 2);
        remoteActionCompat.f1548c = aVar.l(remoteActionCompat.f1548c, 3);
        remoteActionCompat.f1549d = (PendingIntent) aVar.r(remoteActionCompat.f1549d, 4);
        remoteActionCompat.f1550e = aVar.h(remoteActionCompat.f1550e, 5);
        remoteActionCompat.f1551f = aVar.h(remoteActionCompat.f1551f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f1546a, 1);
        aVar.D(remoteActionCompat.f1547b, 2);
        aVar.D(remoteActionCompat.f1548c, 3);
        aVar.H(remoteActionCompat.f1549d, 4);
        aVar.z(remoteActionCompat.f1550e, 5);
        aVar.z(remoteActionCompat.f1551f, 6);
    }
}
