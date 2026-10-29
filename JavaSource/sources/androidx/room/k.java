package androidx.room;

import java.io.File;
import x0.c;

/* compiled from: MyApplication */
class k implements c.InterfaceC0143c {

    /* renamed from: a, reason: collision with root package name */
    private final String f2812a;

    /* renamed from: b, reason: collision with root package name */
    private final File f2813b;

    /* renamed from: c, reason: collision with root package name */
    private final c.InterfaceC0143c f2814c;

    k(String str, File file, c.InterfaceC0143c interfaceC0143c) {
        this.f2812a = str;
        this.f2813b = file;
        this.f2814c = interfaceC0143c;
    }

    @Override // x0.c.InterfaceC0143c
    public x0.c a(c.b bVar) {
        return new j(bVar.f27201a, this.f2812a, this.f2813b, bVar.f27203c.f27200a, this.f2814c.a(bVar));
    }
}
