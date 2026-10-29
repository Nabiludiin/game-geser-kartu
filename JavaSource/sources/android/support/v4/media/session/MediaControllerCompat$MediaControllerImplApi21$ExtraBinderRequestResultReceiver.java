package android.support.v4.media.session;

import android.os.Bundle;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

/* compiled from: MyApplication */
class MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver extends ResultReceiver {

    /* renamed from: q, reason: collision with root package name */
    private WeakReference f75q;

    @Override // android.os.ResultReceiver
    protected void onReceiveResult(int i7, Bundle bundle) {
        b.a(this.f75q.get());
    }
}
