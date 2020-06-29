package info;

import streamableInterface.IStreamable;

public class StreamProgressInfo
{
    private IStreamable file;

    public StreamProgressInfo(IStreamable file)
    {
        this.file = file;
    }

    public int CalculateCurrentPercent()
    {
        return file.getBytesSent() * 100 / file.getLength();
    }
}
