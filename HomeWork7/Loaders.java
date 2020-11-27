package HomeWork7;

public class Loaders {
    public static SiteLoader newABLoader() {
        return new ABLoader();
    }

    public static SiteLoader newNBRBLoader() {
        return new NBRBLoader();
    }

    private Loaders() {}
}
