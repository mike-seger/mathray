package mathray.device;

import mathray.Multidef;
import mathray.concrete.BlockD3;
import mathray.concrete.RayD3;

public class Computation implements FunctionTypes.All {
  
  public final Multidef def;
  
  public Computation(Multidef def) {
    this.def = def;
  }
  
  @Override
  public int getInputArity() {
    return def.args.size();
  }
  
  @Override
  public int getOutputArity() {
    return def.value.size();
  }

  @Override
  public void call(double[] args, double[] res) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void call(float[] args, float[] res) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public double call(double x) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float call(float x) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double call(double x, double y) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float call(float x, float y) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public double call(double x, double y, double z) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public float call(float x, float y, float z) {
    // TODO Auto-generated method stub
    return 0;
  }

  @Override
  public boolean maybeHasZeroOn(RayD3 args) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public void fill(double[] limits, int[] counts, double[] result) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void fill(float[] limits, int[] counts, float[] result) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void repeat(double[] args, double[] res) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public void repeat(float[] args, float[] res) {
    // TODO Auto-generated method stub
    
  }

  @Override
  public boolean maybeHasZeroIn(BlockD3 args) {
    // TODO Auto-generated method stub
    return false;
  }

}
