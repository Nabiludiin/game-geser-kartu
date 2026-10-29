package y1;

import java.util.Set;

/* compiled from: MyApplication */
final class p implements w1.g {

    /* renamed from: a, reason: collision with root package name */
    private final Set f27611a;

    /* renamed from: b, reason: collision with root package name */
    private final o f27612b;

    /* renamed from: c, reason: collision with root package name */
    private final s f27613c;

    p(Set set, o oVar, s sVar) {
        this.f27611a = set;
        this.f27612b = oVar;
        this.f27613c = sVar;
    }

    @Override // w1.g
    public w1.f a(String str, Class cls, w1.b bVar, w1.e eVar) {
        if (this.f27611a.contains(bVar)) {
            return new r(this.f27612b, str, bVar, eVar, this.f27613c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", bVar, this.f27611a));
    }
}
