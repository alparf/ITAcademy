package HomeWork7.Loaders;

public class LoaderFactory {
    public static SiteLoader newABLoader() {
        return new ABLoader();
    }

    public static SiteLoader newNBRBLoader() {
        return new NBRBLoader();
    }

    private LoaderFactory() {}
}
