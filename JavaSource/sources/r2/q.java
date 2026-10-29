package r2;

import android.os.AsyncTask;
import java.util.Objects;

/* compiled from: MyApplication */
final class q extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ s f25821a;

    /* synthetic */ q(s sVar, byte[] bArr) {
        Objects.requireNonNull(sVar);
        this.f25821a = sVar;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.f25821a.l8();
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        s sVar = this.f25821a;
        String str = (String) obj;
        if (sVar.o8() == null || str == null) {
            return;
        }
        sVar.o8().loadUrl(str);
    }
}
