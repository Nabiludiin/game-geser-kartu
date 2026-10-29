package i6;

/* compiled from: MyApplication */
public abstract class j extends a {
    public j(g6.e eVar) {
        super(eVar);
        if (eVar != null && eVar.getContext() != g6.j.f24049q) {
            throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
        }
    }

    @Override // g6.e
    public g6.i getContext() {
        return g6.j.f24049q;
    }
}
