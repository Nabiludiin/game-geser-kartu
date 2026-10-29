package e1;

import androidx.work.OverwritingInputMerger;
import e1.u;

/* compiled from: MyApplication */
public final class l extends u {
    l(a aVar) {
        super(aVar.f23195b, aVar.f23196c, aVar.f23197d);
    }

    public static l d(Class cls) {
        return (l) new a(cls).b();
    }

    /* compiled from: MyApplication */
    public static final class a extends u.a {
        public a(Class cls) {
            super(cls);
            this.f23196c.f24712d = OverwritingInputMerger.class.getName();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // e1.u.a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l c() {
            if (this.f23194a && this.f23196c.f24718j.h()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new l(this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // e1.u.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a d() {
            return this;
        }
    }
}
