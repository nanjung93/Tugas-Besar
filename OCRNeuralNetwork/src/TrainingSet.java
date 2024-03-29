import java.io.*;
import java.util.*;

public class TrainingSet
{

  protected int inputCount;
  protected int outputCount;
  protected double input[][];
  protected double output[][];
  protected double classify[];
  protected int trainingSetCount;

  /**
   * The constructor.
   * 
   * @param inputCount
   *          Number of input neurons
   * @param outputCount
   *          Number of output neurons
   */
  TrainingSet(int inputCount, int outputCount)
  {
    this.inputCount = inputCount;
    this.outputCount = outputCount;
    trainingSetCount = 0;
  }

  /**
   * Get the input neuron count
   * 
   * @return The input neuron count
   */
  public int getInputCount()
  {
    return inputCount;
  }

  /**
   * Get the output neuron count
   * 
   * @return The output neuron count
   */
  public int getOutputCount()
  {
    return outputCount;
  }

  /**
   * Set the number of entries in the training set. This method also allocates
   * space for them.
   * 
   * @param trainingSetCount
   *          How many entries in the training set.
   */
  public void setTrainingSetCount(int trainingSetCount)
  {
    this.trainingSetCount = trainingSetCount;
    input = new double[trainingSetCount][inputCount];
    output = new double[trainingSetCount][outputCount];
    classify = new double[trainingSetCount];
  }

  /**
   * Get the training set data.
   * 
   * @return Training set data.
   */
  public int getTrainingSetCount()
  {
    return trainingSetCount;
  }

  /**
   * Set one of the training set's inputs.
   * 
   * @param set
   *          The entry number
   * @param index
   *          The index(which item in that set)
   * @param value
   *          The value
   * @exception java.lang.RuntimeException
   */
  void setInput(int set, int index, double value) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException(" atur range:" + set));
    if ((index < 0) || (index >= inputCount))
      throw (new RuntimeException("Index range:" + index));
    input[set][index] = value;
  }

  /**
   * Set one of the training set's outputs.
   * 
   * @param set
   *          The entry number
   * @param index
   *          The index(which item in that set)
   * @param value
   *          The value
   * @exception java.lang.RuntimeException
   */
  void setOutput(int set, int index, double value) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("atur range::" + set));
    if ((index < 0) || (set >= outputCount))
      throw (new RuntimeException("Index range:" + index));
    output[set][index] = value;
  }

  /**
   * Set one of the training set's classifications.
   * 
   * @param set
   *          The entry number
   * @param value
   *          The value
   * @exception java.lang.RuntimeException
   */
  void setClassify(int set, double value) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Aturrange:" + set));
    classify[set] = value;
  }

  /**
   * Get a specified input value.
   * 
   * @param set
   *          The input entry.
   * @param index
   *          The index
   * @return An individual input
   * @exception java.lang.RuntimeException
   */
  double getInput(int set, int index) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Indexrange:" + set));
    if ((index < 0) || (index >= inputCount))
      throw (new RuntimeException("index range:" + index));
    return input[set][index];
  }

  /**
   * Get one of the output values.
   * 
   * @param set
   *          The entry
   * @param index
   *          Which value in the entry
   * @return The output value.
   * @exception java.lang.RuntimeException
   */
  double getOutput(int set, int index) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Atur range:" + set));
    if ((index < 0) || (set >= outputCount))
      throw (new RuntimeException("index  range:" + index));
    return output[set][index];
  }

  /**
   * Get the classification.
   * 
   * @param set
   *          Which entry.
   * @return The classification for the specified entry.
   * @exception java.lang.RuntimeException
   */
  double getClassify(int set) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Atur range:" + set));
    return classify[set];
  }

  /**
   * Calculate the classifications.
   * 
   * @param c
   *          The classification
   */
  void CalculateClass(int c)
  {
    for (int i = 0; i <= trainingSetCount; i++)
    {
      classify[i] = c + 0.1;
    }
  }

  /**
   * Get an output set.
   * 
   * @param set
   *          The entry requested.
   * @return The complete output set as an array.
   * @exception java.lang.RuntimeException
   */

  double[] getOutputSet(int set) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Atur range:" + set));
    return output[set];
  }

  /**
   * Get an input set.
   * 
   * @param set
   *          The entry requested.
   * @return The complete input set as an array.
   * @exception java.lang.RuntimeException
   */

  double[] getInputSet(int set) throws RuntimeException
  {
    if ((set < 0) || (set >= trainingSetCount))
      throw (new RuntimeException("Atur range:" + set));
    return input[set];
  }

}
