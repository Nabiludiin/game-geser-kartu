package q0;

import a5.d;
import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.measurement.m;
import androidx.privacysandbox.ads.adservices.measurement.o;
import e6.n;
import e6.s;
import i6.k;
import p6.p;
import q6.e;
import q6.i;
import x6.g0;
import x6.h0;
import x6.n0;
import x6.t0;

/* compiled from: MyApplication */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final b f25575a = new b(null);

    /* compiled from: MyApplication */
    /* renamed from: q0.a$a, reason: collision with other inner class name */
    private static final class C0120a extends a {

        /* renamed from: b, reason: collision with root package name */
        private final androidx.privacysandbox.ads.adservices.measurement.b f25576b;

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$a, reason: collision with other inner class name */
        static final class C0121a extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25577u;

            C0121a(androidx.privacysandbox.ads.adservices.measurement.a aVar, g6.e eVar) {
                super(2, eVar);
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new C0121a(null, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25577u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    this.f25577u = 1;
                    if (bVar.a(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((C0121a) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$b */
        static final class b extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25579u;

            b(g6.e eVar) {
                super(2, eVar);
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new b(eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25579u;
                if (i7 != 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                    return obj;
                }
                n.b(obj);
                androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                this.f25579u = 1;
                Object b8 = bVar.b(this);
                return b8 == e8 ? e8 : b8;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((b) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$c */
        static final class c extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25581u;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ Uri f25583w;

            /* renamed from: x, reason: collision with root package name */
            final /* synthetic */ InputEvent f25584x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Uri uri, InputEvent inputEvent, g6.e eVar) {
                super(2, eVar);
                this.f25583w = uri;
                this.f25584x = inputEvent;
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new c(this.f25583w, this.f25584x, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25581u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    Uri uri = this.f25583w;
                    InputEvent inputEvent = this.f25584x;
                    this.f25581u = 1;
                    if (bVar.c(uri, inputEvent, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((c) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$d */
        static final class d extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25585u;

            d(m mVar, g6.e eVar) {
                super(2, eVar);
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new d(null, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25585u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    this.f25585u = 1;
                    if (bVar.d(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((d) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$e */
        static final class e extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25587u;

            /* renamed from: w, reason: collision with root package name */
            final /* synthetic */ Uri f25589w;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Uri uri, g6.e eVar) {
                super(2, eVar);
                this.f25589w = uri;
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new e(this.f25589w, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25587u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    Uri uri = this.f25589w;
                    this.f25587u = 1;
                    if (bVar.e(uri, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((e) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$f */
        static final class f extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25590u;

            f(androidx.privacysandbox.ads.adservices.measurement.n nVar, g6.e eVar) {
                super(2, eVar);
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new f(null, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25590u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    this.f25590u = 1;
                    if (bVar.f(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((f) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        /* compiled from: MyApplication */
        /* renamed from: q0.a$a$g */
        static final class g extends k implements p {

            /* renamed from: u, reason: collision with root package name */
            int f25592u;

            g(o oVar, g6.e eVar) {
                super(2, eVar);
            }

            @Override // i6.a
            public final g6.e j(Object obj, g6.e eVar) {
                return C0120a.this.new g(null, eVar);
            }

            @Override // i6.a
            public final Object m(Object obj) {
                Object e8 = h6.b.e();
                int i7 = this.f25592u;
                if (i7 == 0) {
                    n.b(obj);
                    androidx.privacysandbox.ads.adservices.measurement.b bVar = C0120a.this.f25576b;
                    this.f25592u = 1;
                    if (bVar.g(null, this) == e8) {
                        return e8;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    n.b(obj);
                }
                return s.f23253a;
            }

            @Override // p6.p
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public final Object i(g0 g0Var, g6.e eVar) {
                return ((g) j(g0Var, eVar)).m(s.f23253a);
            }
        }

        public C0120a(androidx.privacysandbox.ads.adservices.measurement.b bVar) {
            i.e(bVar, "mMeasurementManager");
            this.f25576b = bVar;
        }

        @Override // q0.a
        public a5.d b() {
            n0 b8;
            b8 = x6.g.b(h0.a(t0.a()), null, null, new b(null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        @Override // q0.a
        public a5.d c(Uri uri, InputEvent inputEvent) {
            n0 b8;
            i.e(uri, "attributionSource");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new c(uri, inputEvent, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        @Override // q0.a
        public a5.d d(Uri uri) {
            n0 b8;
            i.e(uri, "trigger");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new e(uri, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        public a5.d f(androidx.privacysandbox.ads.adservices.measurement.a aVar) {
            n0 b8;
            i.e(aVar, "deletionRequest");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new C0121a(aVar, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        public a5.d g(m mVar) {
            n0 b8;
            i.e(mVar, "request");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new d(mVar, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        public a5.d h(androidx.privacysandbox.ads.adservices.measurement.n nVar) {
            n0 b8;
            i.e(nVar, "request");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new f(nVar, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }

        public a5.d i(o oVar) {
            n0 b8;
            i.e(oVar, "request");
            b8 = x6.g.b(h0.a(t0.a()), null, null, new g(oVar, null), 3, null);
            return p0.b.c(b8, null, 1, null);
        }
    }

    /* compiled from: MyApplication */
    public static final class b {
        public /* synthetic */ b(e eVar) {
            this();
        }

        public final a a(Context context) {
            i.e(context, "context");
            androidx.privacysandbox.ads.adservices.measurement.b a8 = androidx.privacysandbox.ads.adservices.measurement.b.f2566a.a(context);
            if (a8 != null) {
                return new C0120a(a8);
            }
            return null;
        }

        private b() {
        }
    }

    public static final a a(Context context) {
        return f25575a.a(context);
    }

    public abstract d b();

    public abstract d c(Uri uri, InputEvent inputEvent);

    public abstract d d(Uri uri);
}
