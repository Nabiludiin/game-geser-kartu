package com.google.android.gms.ads.internal.util;

import android.content.Context;
import androidx.work.a;
import androidx.work.b;
import com.google.android.gms.ads.internal.offline.buffering.OfflineNotificationPoster;
import com.google.android.gms.ads.internal.offline.buffering.OfflinePingSender;
import e1.b;
import e1.k;
import e1.l;
import e1.t;
import v2.p0;
import w2.p;
import w3.b;

/* compiled from: MyApplication */
public class WorkManagerUtil extends p0 {
    private static void j8(Context context) {
        try {
            t.e(context.getApplicationContext(), new a.b().a());
        } catch (IllegalStateException unused) {
        }
    }

    @Override // v2.q0
    public final boolean zze(w3.a aVar, String str, String str2) {
        return zzg(aVar, new t2.a(str, str2, ""));
    }

    @Override // v2.q0
    public final void zzf(w3.a aVar) {
        Context context = (Context) b.r0(aVar);
        j8(context);
        try {
            t d8 = t.d(context);
            d8.a("offline_ping_sender_work");
            d8.b((l) ((l.a) ((l.a) new l.a(OfflinePingSender.class).e(new b.a().b(k.CONNECTED).a())).a("offline_ping_sender_work")).b());
        } catch (IllegalStateException e8) {
            p.g("Failed to instantiate WorkManager.", e8);
        }
    }

    @Override // v2.q0
    public final boolean zzg(w3.a aVar, t2.a aVar2) {
        Context context = (Context) w3.b.r0(aVar);
        j8(context);
        e1.b a8 = new b.a().b(k.CONNECTED).a();
        try {
            t.d(context).b((l) ((l.a) ((l.a) ((l.a) new l.a(OfflineNotificationPoster.class).e(a8)).f(new b.a().e("uri", aVar2.f26390q).e("gws_query_id", aVar2.f26391r).e("image_url", aVar2.f26392s).a())).a("offline_notification_work")).b());
            return true;
        } catch (IllegalStateException e8) {
            p.g("Failed to instantiate WorkManager.", e8);
            return false;
        }
    }
}
