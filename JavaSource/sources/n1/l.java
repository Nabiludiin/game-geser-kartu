package n1;

import androidx.work.WorkerParameters;

/* compiled from: MyApplication */
public class l implements Runnable {

    /* renamed from: q, reason: collision with root package name */
    private f1.j f24949q;

    /* renamed from: r, reason: collision with root package name */
    private String f24950r;

    /* renamed from: s, reason: collision with root package name */
    private WorkerParameters.a f24951s;

    public l(f1.j jVar, String str, WorkerParameters.a aVar) {
        this.f24949q = jVar;
        this.f24950r = str;
        this.f24951s = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24949q.m().k(this.f24950r, this.f24951s);
    }
}
