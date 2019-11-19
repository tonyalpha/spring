package be.tonyalpha.hoofdstuk1.opdracht4.housekeeping.services;

public class GardeningServiceImpl implements GardeningService {
    private GardeningTool tool;
    void setGardeningTool(GardeningTool tool) {
        this.tool = tool;
    }
    public void garden() {
        System.out.println("Working in the garden");
        tool.doGardenJob();
    }
    public void init() {
        System.out.println("GardeningService preparing for work");
    }

    public void destroy() {
        System.out.println("GardeningService cleaning up");
    }
}
