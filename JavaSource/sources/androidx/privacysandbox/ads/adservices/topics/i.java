package androidx.privacysandbox.ads.adservices.topics;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;

/* compiled from: MyApplication */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final List f2585a;

    /* renamed from: b, reason: collision with root package name */
    private final List f2586b;

    public i(List list, List list2) {
        q6.i.e(list, "topics");
        q6.i.e(list2, "encryptedTopics");
        this.f2585a = list;
        this.f2586b = list2;
    }

    public final List a() {
        return this.f2585a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return this.f2585a.size() == iVar.f2585a.size() && this.f2586b.size() == iVar.f2586b.size() && q6.i.a(new HashSet(this.f2585a), new HashSet(iVar.f2585a)) && q6.i.a(new HashSet(this.f2586b), new HashSet(iVar.f2586b));
    }

    public int hashCode() {
        return Objects.hash(this.f2585a, this.f2586b);
    }

    public String toString() {
        return "GetTopicsResponse: Topics=" + this.f2585a + ", EncryptedTopics=" + this.f2586b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(List list) {
        this(list, f6.l.c());
        q6.i.e(list, "topics");
    }
}
