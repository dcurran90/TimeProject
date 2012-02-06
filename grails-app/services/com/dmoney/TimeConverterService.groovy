package com.dmoney

import org.joda.time.*


class X
{
    def field = 1
    def getField()
    {
        field += 1
    }
}



class TimeConverterService {
    
    static transactional = true
    
    def getTime(def zone) 
    {
        // Get the time period we want complete builds from
        def time = new LocalTime()  
        def today = new DateTime()
        
        zone = zone + ""
        if (zone != null) {
            
            switch (zone){
                case 'h':
                    today = today.plusHours(-10)
                    break
                case 'e': 
                    today = today.plusHours(1)
                    break
                case 'c':
                    //do nothing
                    break
                case 'm':
                    today = today.minusHours(1)
                    break
                case 'p': 
                    today = today.minusHours(2)  
                    break
                default:
                    return [['ErrorMsg':'Improper time zone format']]
                    break
            }   
            
         /*   def myX = new X()
            myX.field = 2
            println myX.field + '***'
            println myX.@field + "---"
            */
            return [['Hour':today.hourOfDay, 'Minute': today.minuteOfHour,
                         'Month': today.monthOfYear, 'Day': today.dayOfMonth, 'Year': today.year]]                
        }
    }
}