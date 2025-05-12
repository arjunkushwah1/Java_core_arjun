package collection_worksheet_2.Q11_company_asset_tracker;

public class Asset
{
    private String id;
    private String name;

    public Asset(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Asset{" + "id='" + id + '\'' + ", name='" + name + '\'' + '}';
    }
}
