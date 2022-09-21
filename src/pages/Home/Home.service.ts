import axios from "axios";
import { stringify } from "querystring";
import { API } from "../../config";

export const getLocals = async () => {
  try {
    const url = new URL(`${API}/locals`);
    const response = await axios.get(`${url}`);
    return response.data;
  } catch (error: any) {
    return null;
  }
};

export const makeReservation = async (data: any) => {
  console.log("DATA", data);
  try {
    const url = new URL(`${API}/save`);
    const jsonData = JSON.stringify(data);
    const response = await axios.post(`${url}`, {
      jsonData,
    });

    console.log("RESPONSE", response);
  } catch (e: any) {
    console.log("ERROR", e);
  }
};
